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
 * <p>Implements {@link TextboxRole}.</p>
 */
class TextboxRoleImpl
    extends RoleImpl
    implements TextboxRole {

  TextboxRoleImpl(String roleName) {
    super(roleName);
  }

  @Override
  public String getAriaActivedescendantProperty(HTMLElement element) {
    return Property.ACTIVEDESCENDANT.get(element);
  }

  @Override
  public String getAriaAutocompleteProperty(HTMLElement element) {
    return Property.AUTOCOMPLETE.get(element);
  }

  @Override
  public String getAriaMultilineProperty(HTMLElement element) {
    return Property.MULTILINE.get(element);
  }

  @Override
  public String getAriaReadonlyProperty(HTMLElement element) {
    return Property.READONLY.get(element);
  }

  @Override
  public String getAriaRequiredProperty(HTMLElement element) {
    return Property.REQUIRED.get(element);
  }

  @Override
  public void removeAriaActivedescendantProperty(HTMLElement element) {
    Property.ACTIVEDESCENDANT.remove(element);
  }

  @Override
  public void removeAriaAutocompleteProperty(HTMLElement element) {
    Property.AUTOCOMPLETE.remove(element);
  }

  @Override
  public void removeAriaMultilineProperty(HTMLElement element) {
    Property.MULTILINE.remove(element);
  }

  @Override
  public void removeAriaReadonlyProperty(HTMLElement element) {
    Property.READONLY.remove(element);
  }

  @Override
  public void removeAriaRequiredProperty(HTMLElement element) {
    Property.REQUIRED.remove(element);
  }

  @Override
  public void setAriaActivedescendantProperty(HTMLElement element,
      Id value) {
    Property.ACTIVEDESCENDANT.set(element,
        value);
  }

  @Override
  public void setAriaAutocompleteProperty(HTMLElement element,
      AutocompleteValue value) {
    Property.AUTOCOMPLETE.set(element,
        value);
  }

  @Override
  public void setAriaMultilineProperty(HTMLElement element,
      boolean value) {
    Property.MULTILINE.set(element,
        value);
  }

  @Override
  public void setAriaReadonlyProperty(HTMLElement element,
      boolean value) {
    Property.READONLY.set(element,
        value);
  }

  @Override
  public void setAriaRequiredProperty(HTMLElement element,
      boolean value) {
    Property.REQUIRED.set(element,
        value);
  }
}
