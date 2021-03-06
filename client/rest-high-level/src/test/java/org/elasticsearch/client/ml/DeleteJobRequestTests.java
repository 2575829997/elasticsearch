/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.elasticsearch.client.ml;

import org.elasticsearch.client.ml.job.config.JobTests;
import org.elasticsearch.test.ESTestCase;

public class DeleteJobRequestTests extends ESTestCase {

    private DeleteJobRequest createTestInstance() {
        return new DeleteJobRequest(JobTests.randomValidJobId());
    }

    public void test_WithNullJobId() {
        NullPointerException ex = expectThrows(NullPointerException.class, () -> new DeleteJobRequest(null));
        assertEquals("[job_id] must not be null", ex.getMessage());

        ex = expectThrows(NullPointerException.class, () -> createTestInstance().setJobId(null));
        assertEquals("[job_id] must not be null", ex.getMessage());
    }
}
