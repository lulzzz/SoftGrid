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
package org.openmuc.j60870;

import org.openmuc.j60870.job.Job;
import org.openmuc.j60870.job.MessageContext;

public class AsduWorker implements Runnable {
    private MessageContext messageContext;
    private Job job;

    public AsduWorker(MessageContext messageContext, Job job) {
        this.messageContext = messageContext;
        this.job = job;
    }

    @Override
    public void run() {

        if (messageContext != null &&
                messageContext.getConnection() != null &&
                messageContext.getaSdu() != null) {
            job.execute(messageContext);


        }
    }
}
