/*
 * Copyright (c) 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not  use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package com.example.echo;

import com.google.api.server.spi.guice.EndpointsModule;
import com.google.common.collect.ImmutableList;

// [START endpoints_module]
public class EchoEndpointModule extends EndpointsModule {
  @Override
  public void configureServlets() {
    bind(Echo.class).toInstance(new Echo());
    configureEndpoints("/_ah/api/*", ImmutableList.of(Echo.class));
    super.configureServlets();
  }
}
// [END endpoints_module]
