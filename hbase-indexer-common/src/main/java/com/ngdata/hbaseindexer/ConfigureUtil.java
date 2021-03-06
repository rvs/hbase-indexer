/*
 * Copyright 2013 NGDATA nv
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ngdata.hbaseindexer;

import java.util.Map;

public class ConfigureUtil {
    
    /**
     * Configure an object with the given map of parameters if the object implements {@link Configurable}.
     * @param obj object to configure
     * @param params configuration parameters
     */
    public static void configure(Object obj, Map<String,String> params) {
        if (obj instanceof Configurable) {
            ((Configurable)obj).configure(params);
        }
    }

}
