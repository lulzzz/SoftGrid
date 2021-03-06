/* Copyright (C) 2016 Advanced Digital Science Centre

        * This file is part of Soft-Grid.
        * For more information visit https://www.illinois.adsc.com.sg/cybersage/
        *
        * Soft-Grid is free software: you can redistribute it and/or modify
        * it under the terms of the GNU General Public License as published by
        * the Free Software Foundation, either version 3 of the License, or
        * (at your option) any later version.
        *
        * Soft-Grid is distributed in the hope that it will be useful,
        * but WITHOUT ANY WARRANTY; without even the implied warranty of
        * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
        * GNU General Public License for more details.
        *
        * You should have received a copy of the GNU General Public License
        * along with Soft-Grid.  If not, see <http://www.gnu.org/licenses/>.

        * @author Prageeth Mahendra Gunathilaka
*/
package it.illinois.adsc.ema.common.webservice;

/**
 * Created by prageethmahendra on 1/9/2016.
 */
public class ExperimentResponse {
    ExperimentRequest experimentRequest;
    ExperimentStatus experimentStatus;
//    private SecurityContext securityContext;
    private int logFileCount;

    public ExperimentResponse() {
    }

    public ExperimentRequest getExperimentRequest() {
        return experimentRequest;
    }

    public void setExperimentRequest(ExperimentRequest experimentRequest) {
        this.experimentRequest = experimentRequest;
    }

    public ExperimentStatus getExperimentStatus() {
        return experimentStatus;
    }

    public void setExperimentStatus(ExperimentStatus experimentStatus) {
        this.experimentStatus = experimentStatus;
    }



//    public SecurityContext getSecurityContext() {
//        return securityContext;
//    }
//
//    public void setSecurityContext(SecurityContext securityContext) {
//        this.securityContext = securityContext;
//    }

    public int getLogFileCount() {
        return logFileCount;
    }

    public void setLogFileCount(int logFileCount) {
        this.logFileCount = logFileCount;
    }

//    @Override
//    public String toString() {
//        return (experimentRequest != null ? experimentRequest.toString() : "") + " " + logFileCount;
//    }
}
