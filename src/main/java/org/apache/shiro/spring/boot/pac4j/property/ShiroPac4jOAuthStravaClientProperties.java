/*
 * Copyright (c) 2018, vindell (https://github.com/vindell).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.shiro.spring.boot.pac4j.property;

public class ShiroPac4jOAuthStravaClientProperties extends ShiroPac4jOAuthClientProperties {
   
	/**
     * approvalPrompt is by default "auto".   <br>
     * If "force", then the authorization dialog is always displayed by Strava.
     */
    private String approvalPrompt = "auto";

	public String getApprovalPrompt() {
		return approvalPrompt;
	}

	public void setApprovalPrompt(String approvalPrompt) {
		this.approvalPrompt = approvalPrompt;
	}

}
