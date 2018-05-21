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
 * <p>Implements {@link SpinbuttonRole}.</p>
 */
class SpinbuttonRoleImpl
    extends RoleImpl
    implements SpinbuttonRole {

  SpinbuttonRoleImpl(String roleName) {
    super(roleName);
  }

  @Override
  public String getAriaRequiredProperty(HTMLElement element) {
    return Property.REQUIRED.get(element);
  }

  @Override
  public void removeAriaRequiredProperty(HTMLElement element) {
    Property.REQUIRED.remove(element);
  }

  @Override
  public void setAriaRequiredProperty(HTMLElement element,
      boolean value) {
    Property.REQUIRED.set(element,
        value);
  }

  @Override
  public String getAriaValuemaxProperty(HTMLElement element) {
    return Property.VALUEMAX.get(element);
  }

  @Override
  public String getAriaValueminProperty(HTMLElement element) {
    return Property.VALUEMIN.get(element);
  }

  @Override
  public String getAriaValuenowProperty(HTMLElement element) {
    return Property.VALUENOW.get(element);
  }

  @Override
  public String getAriaValuetextProperty(HTMLElement element) {
    return Property.VALUETEXT.get(element);
  }

  @Override
  public void removeAriaValuemaxProperty(HTMLElement element) {
    Property.VALUEMAX.remove(element);
  }

  @Override
  public void removeAriaValueminProperty(HTMLElement element) {
    Property.VALUEMIN.remove(element);
  }

  @Override
  public void removeAriaValuenowProperty(HTMLElement element) {
    Property.VALUENOW.remove(element);
  }

  @Override
  public void removeAriaValuetextProperty(HTMLElement element) {
    Property.VALUETEXT.remove(element);
  }

  @Override
  public void setAriaValuemaxProperty(HTMLElement element,
      Number value) {
    Property.VALUEMAX.set(element,
        value);
  }

  @Override
  public void setAriaValueminProperty(HTMLElement element,
      Number value) {
    Property.VALUEMIN.set(element,
        value);
  }

  @Override
  public void setAriaValuenowProperty(HTMLElement element,
      Number value) {
    Property.VALUENOW.set(element,
        value);
  }

  @Override
  public void setAriaValuetextProperty(HTMLElement element,
      String value) {
    Property.VALUETEXT.set(element,
        value);
  }
}
