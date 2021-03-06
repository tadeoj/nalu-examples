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

package com.github.nalukit.example.nalu.simpleapplication.client.ui.content.search;

import com.github.nalukit.example.nalu.simpleapplication.client.NaluSimpleApplicationContext;
import com.github.nalukit.example.nalu.simpleapplication.client.event.StatusChangeEvent;
import com.github.nalukit.nalu.client.component.AbstractComponentController;
import com.github.nalukit.nalu.client.component.annotation.AcceptParameter;
import com.github.nalukit.nalu.client.component.annotation.Controller;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Widget;

import java.util.Objects;

@Controller(route = "/application/search/:searchName/:searchCity",
            selector = "content",
            component = SearchComponent.class,
            componentInterface = ISearchComponent.class)
public class SearchController
    extends AbstractComponentController<NaluSimpleApplicationContext, ISearchComponent, Widget>
    implements ISearchComponent.Controller {

  public SearchController() {
  }

  @Override
  public void start() {
    this.eventBus.fireEvent(new StatusChangeEvent("Please enter data!"));

    if (!Objects.isNull(this.router.getNaluErrorMessage())) {
      Window.alert(this.router.getNaluErrorMessage()
                              .getErrorMessage());
    }
  }

  @Override
  public void doClickSearchButton(String searchName,
                                  String searchCity) {
    this.context.setSearchCity(searchCity);
    this.context.setSearchName(searchName);
    this.router.route("/application/list",
                      searchName,
                      searchCity);
  }

  @AcceptParameter("searchName")
  public void setSearchName(String searchName) {
    if (!"undefined".equals(searchName) &&
        searchName.trim()
                  .length() > 0) {
      this.component.setSearchName(searchName);
    }
  }

  @AcceptParameter("searchCity")
  public void setSearchCity(String searchCity) {
    if (!"undefined".equals(searchCity) &&
        searchCity.trim()
                  .length() > 0) {
      this.component.setSearchCity(searchCity);
    }
  }

}
