/*
 * Copyright (c) 2018 - Frank Hossfeld
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

package com.github.nalukit.example.nalu.loginapplication.client;

import com.github.nalukit.example.nalu.loginapplication.client.filters.LoginFilter;
import com.github.nalukit.example.nalu.loginapplication.client.ui.viewport.applicaitonviewport.ApplicationShell;
import com.github.nalukit.example.nalu.loginapplication.client.ui.viewport.loginviewport.LoginShell;
import com.github.nalukit.nalu.client.application.IsApplication;
import com.github.nalukit.nalu.client.application.annotation.*;
import com.github.nalukit.nalu.client.application.annotation.Application;
import com.github.nalukit.nalu.client.application.annotation.Shells;
import com.github.nalukit.nalu.plugin.elemental2.client.DefaultElemental2Logger;

/**
 * Implemantation of the NaluLoginApplication class.
 * <p>
 * <p>Use the @Application annotation to perform configuration informations.</p>
 * <p>In this case we use 'NaluLoginApplicationLoader' as loader!</p>
 * <p>Please keep in mind, the services are simulated inside the client (because this is not part of the
 * framework). You can use any technique to call the server!</p>
 */
@Application(loader = NaluLoginApplicationLoader.class,
             startRoute = "/loginViewport/login",
             context = NaluLoginApplicationContext.class)
@Shells({ @Shell(name = "loginViewport",
                 shell = LoginShell.class),
          @Shell(name = "applicationViewport",
                 shell = ApplicationShell.class) })
@Filters(filterClasses = LoginFilter.class)
@Debug(logLevel = Debug.LogLevel.DETAILED,
       logger = DefaultElemental2Logger.class)
interface NaluLoginApplication
    extends IsApplication {
}