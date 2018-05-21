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
 * The base class for implementing a Role. Includes basic operations for modifying the "role"
 * attribute and methods that are common to all roles.
 */
class RoleImpl
    implements Role {

  private static final String ATTR_NAME_ROLE = "role";

  private final String roleName;

  RoleImpl(String roleName) {
    assert roleName != null : "Role name cannot be null";
    this.roleName = roleName;
  }

  @Override
  public String getAriaAtomicProperty(HTMLElement element) {
    return Property.ATOMIC.get(element);
  }

  @Override
  public String getAriaBusyState(HTMLElement element) {
    return State.BUSY.get(element);
  }

  @Override
  public String getAriaControlsProperty(HTMLElement element) {
    return Property.CONTROLS.get(element);
  }

  @Override
  public String getAriaDescribedbyProperty(HTMLElement element) {
    return Property.DESCRIBEDBY.get(element);
  }

  @Override
  public String getAriaDisabledState(HTMLElement element) {
    return State.DISABLED.get(element);
  }

  @Override
  public String getAriaDropeffectProperty(HTMLElement element) {
    return Property.DROPEFFECT.get(element);
  }

  @Override
  public String getAriaFlowtoProperty(HTMLElement element) {
    return Property.FLOWTO.get(element);
  }

  @Override
  public String getAriaGrabbedState(HTMLElement element) {
    return State.GRABBED.get(element);
  }

  @Override
  public String getAriaHaspopupProperty(HTMLElement element) {
    return Property.HASPOPUP.get(element);
  }

  @Override
  public String getAriaHiddenState(HTMLElement element) {
    return State.HIDDEN.get(element);
  }

  @Override
  public String getAriaInvalidState(HTMLElement element) {
    return State.INVALID.get(element);
  }

  @Override
  public String getAriaLabelledbyProperty(HTMLElement element) {
    return Property.LABELLEDBY.get(element);
  }

  @Override
  public String getAriaLabelProperty(HTMLElement element) {
    return Property.LABEL.get(element);
  }

  @Override
  public String getAriaLiveProperty(HTMLElement element) {
    return Property.LIVE.get(element);
  }

  @Override
  public String getAriaOwnsProperty(HTMLElement element) {
    return Property.OWNS.get(element);
  }

  @Override
  public String getAriaRelevantProperty(HTMLElement element) {
    return Property.RELEVANT.get(element);
  }

  @Override
  public String getName() {
    return roleName;
  }

  @Override
  public String getTabindexExtraAttribute(HTMLElement element) {
    return ExtraAttribute.TABINDEX.get(element);
  }

  @Override
  public void remove(HTMLElement element) {
    assert element != null : "Element cannot be null.";
    element.removeAttribute(ATTR_NAME_ROLE);
  }

  @Override
  public void removeAriaAtomicProperty(HTMLElement element) {
    Property.ATOMIC.remove(element);
  }

  @Override
  public void removeAriaBusyState(HTMLElement element) {
    State.BUSY.remove(element);
  }

  @Override
  public void removeAriaControlsProperty(HTMLElement element) {
    Property.CONTROLS.remove(element);
  }

  @Override
  public void removeAriaDescribedbyProperty(HTMLElement element) {
    Property.DESCRIBEDBY.remove(element);
  }

  @Override
  public void removeAriaDisabledState(HTMLElement element) {
    State.DISABLED.remove(element);
  }

  @Override
  public void removeAriaDropeffectProperty(HTMLElement element) {
    Property.DROPEFFECT.remove(element);
  }

  @Override
  public void removeAriaFlowtoProperty(HTMLElement element) {
    Property.FLOWTO.remove(element);
  }

  @Override
  public void removeAriaGrabbedState(HTMLElement element) {
    State.GRABBED.remove(element);
  }

  @Override
  public void removeAriaHaspopupProperty(HTMLElement element) {
    Property.HASPOPUP.remove(element);
  }

  @Override
  public void removeAriaHiddenState(HTMLElement element) {
    State.HIDDEN.remove(element);
  }

  @Override
  public void removeAriaInvalidState(HTMLElement element) {
    State.INVALID.remove(element);
  }

  @Override
  public void removeAriaLabelledbyProperty(HTMLElement element) {
    Property.LABELLEDBY.remove(element);
  }

  @Override
  public void removeAriaLabelProperty(HTMLElement element) {
    Property.LABEL.remove(element);
  }

  @Override
  public void removeAriaLiveProperty(HTMLElement element) {
    Property.LIVE.remove(element);
  }

  @Override
  public void removeAriaOwnsProperty(HTMLElement element) {
    Property.OWNS.remove(element);
  }

  @Override
  public void removeAriaRelevantProperty(HTMLElement element) {
    Property.RELEVANT.remove(element);
  }

  @Override
  public void removeTabindexExtraAttribute(HTMLElement element) {
    ExtraAttribute.TABINDEX.remove(element);
  }

  @Override
  public void set(HTMLElement element) {
    assert element != null : "Element cannot be null.";
    element.setAttribute(ATTR_NAME_ROLE,
        roleName);
  }

  @Override
  public void setAriaAtomicProperty(HTMLElement element,
      boolean value) {
    Property.ATOMIC.set(element,
        value);
  }

  @Override
  public void setAriaBusyState(HTMLElement element,
      boolean value) {
    State.BUSY.set(element,
        value);
  }

  @Override
  public void setAriaControlsProperty(HTMLElement element,
      Id... value) {
    Property.CONTROLS.set(element,
        value);
  }

  @Override
  public void setAriaDescribedbyProperty(HTMLElement element,
      Id... value) {
    Property.DESCRIBEDBY.set(element,
        value);
  }

  @Override
  public void setAriaDisabledState(HTMLElement element,
      boolean value) {
    State.DISABLED.set(element,
        value);
  }

  @Override
  public void setAriaDropeffectProperty(HTMLElement element,
      DropeffectValue... value) {
    Property.DROPEFFECT.set(element,
        value);
  }

  @Override
  public void setAriaFlowtoProperty(HTMLElement element,
      Id... value) {
    Property.FLOWTO.set(element,
        value);
  }

  @Override
  public void setAriaGrabbedState(HTMLElement element,
      GrabbedValue value) {
    State.GRABBED.set(element,
        value);
  }

  @Override
  public void setAriaHaspopupProperty(HTMLElement element,
      boolean value) {
    Property.HASPOPUP.set(element,
        value);
  }

  @Override
  public void setAriaHiddenState(HTMLElement element,
      boolean value) {
    State.HIDDEN.set(element,
        value);
  }

  @Override
  public void setAriaInvalidState(HTMLElement element,
      InvalidValue value) {
    State.INVALID.set(element,
        value);
  }

  @Override
  public void setAriaLabelledbyProperty(HTMLElement element,
      Id... value) {
    Property.LABELLEDBY.set(element,
        value);
  }

  @Override
  public void setAriaLabelProperty(HTMLElement element,
      String value) {
    Property.LABEL.set(element,
        value);
  }

  @Override
  public void setAriaLiveProperty(HTMLElement element,
      LiveValue value) {
    Property.LIVE.set(element,
        value);
  }

  @Override
  public void setAriaOwnsProperty(HTMLElement element,
      Id... value) {
    Property.OWNS.set(element,
        value);
  }

  @Override
  public void setAriaRelevantProperty(HTMLElement element,
      RelevantValue... value) {
    Property.RELEVANT.set(element,
        value);
  }

  @Override
  public void setTabindexExtraAttribute(HTMLElement element,
      int value) {
    ExtraAttribute.TABINDEX.set(element,
        value);
  }
}
