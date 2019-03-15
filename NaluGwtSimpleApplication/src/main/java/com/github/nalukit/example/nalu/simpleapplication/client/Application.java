/*
 * Copyright (c) 2018 - 2019 - Frank Hossfeld
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not
 *  use this file except in compliance with the License. You may obtain a copy of
 *  the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 *  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 *  License for the specific language governing permissions and limitations under
 *  the License.
 *
 */

package com.github.nalukit.example.nalu.simpleapplication.client;

import com.github.nalukit.nalu.plugin.gwt.client.NaluPluginGWT;
import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Application implements EntryPoint {

  /**
   * <p>This is the entry point method.</p>
   * <p></p>
   */
  public void onModuleLoad() {
    // Create the application.
    // The ApplicationImpl-class
    // will be generated by the framework.
    NaluSimpleApplication application = new NaluSimpleApplicationImpl();
    // start the application by calling the run()-method.
    application.run(new NaluPluginGWT());
  }

}
