/*
 * Copyright 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.gwtproject.aria.client;
/////////////////////////////////////////////////////////
// This is auto-generated code.  Do not manually edit! //
/////////////////////////////////////////////////////////

import elemental2.dom.HTMLElement;

/**
 * <p>Implements {@link MenuitemradioRole}.</p>
 */
class MenuitemradioRoleImpl
    extends RoleImpl
    implements MenuitemradioRole {

  MenuitemradioRoleImpl(String roleName) {
    super(roleName);
  }

  @Override
  public String getAriaCheckedState(HTMLElement element) {
    return State.CHECKED.get(element);
  }

  @Override
  public void removeAriaCheckedState(HTMLElement element) {
    State.CHECKED.remove(element);
  }

  @Override
  public void setAriaCheckedState(HTMLElement element,
      CheckedValue value) {
    State.CHECKED.set(element,
        value);
  }

  @Override
  public String getAriaPosinsetProperty(HTMLElement element) {
    return Property.POSINSET.get(element);
  }

  @Override
  public String getAriaSelectedState(HTMLElement element) {
    return State.SELECTED.get(element);
  }

  @Override
  public String getAriaSetsizeProperty(HTMLElement element) {
    return Property.SETSIZE.get(element);
  }

  @Override
  public void removeAriaPosinsetProperty(HTMLElement element) {
    Property.POSINSET.remove(element);
  }

  @Override
  public void removeAriaSelectedState(HTMLElement element) {
    State.SELECTED.remove(element);
  }

  @Override
  public void removeAriaSetsizeProperty(HTMLElement element) {
    Property.SETSIZE.remove(element);
  }

  @Override
  public void setAriaPosinsetProperty(HTMLElement element,
      int value) {
    Property.POSINSET.set(element,
        value);
  }

  @Override
  public void setAriaSelectedState(HTMLElement element,
      SelectedValue value) {
    State.SELECTED.set(element,
        value);
  }

  @Override
  public void setAriaSetsizeProperty(HTMLElement element,
      int value) {
    Property.SETSIZE.set(element,
        value);
  }
}
