/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.identity.artifact.service.artifact.builder.spring;

public class SpringBuilderConstants {

    //DCR Endpoint
    public static final String DCR_ENDPOINT = "/api/identity/oauth2/dcr/v1.1/register?client_name=";
    //The Http get method
    public static final String HTTP_GET = "GET";
    //The Accept header
    public static final String HEADER_ACCEPT = "ACCEPT";
    //The value of the Accept header
    public static final String DATA_ACCEPT_HEADER = "application/json";
    //The Authorization header
    public static final String Authorization = "Authorization";
    //The Bearer type
    public static final String AUTHORIZATION_HEADER = "authorization";
}