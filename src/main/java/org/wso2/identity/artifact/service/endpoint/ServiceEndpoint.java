package org.wso2.identity.artifact.service.endpoint;

import org.wso2.identity.artifact.service.exception.ClientException;
import org.wso2.identity.artifact.service.exception.ServiceException;
import org.wso2.identity.artifact.service.artifact.Artifact;
import org.wso2.identity.artifact.service.artifact.ArtifactInfo;
import org.wso2.identity.artifact.service.model.Response;
import org.wso2.identity.artifact.service.service.ArtifactService;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/service")
public class ServiceEndpoint {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response<List<ArtifactInfo>> getSupportedArtifacts() {

        ArtifactService artifactService = new ArtifactService();
        return new Response<>(artifactService.getArtifactInfo());
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response<Artifact> getArtifact(String artifactType) {

        try {
            ArtifactService artifactService = new ArtifactService();
            return new Response<>(artifactService.getArtifact(artifactType));
        } catch (ClientException ex) {
            return new Response<>(ex.getMessage());
        } catch (ServiceException e) {
            // TODO: Handle this.
            return new Response<>("Error occurred while calling.");
        }
    }

}