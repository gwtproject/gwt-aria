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
 * A type that represents the <a href="http://www.w3.org/TR/wai-aria/roles#listbox">listbox</a> role
 * in the ARIA specification.
 *
 * @see Role
 * @see Roles
 */
public interface ListboxRole
    extends ListRole,
    SelectRole {

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-multiselectable">
   * aria-multiselectable</a> attribute for the {@code element} or "" if no such attribute is
   * present.
   */
  String getAriaMultiselectableProperty(HTMLElement element);

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-required">
   * aria-required</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaRequiredProperty(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-multiselectable">
   * aria-multiselectable</a> attribute from the {@code element}.
   */
  void removeAriaMultiselectableProperty(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-required">
   * aria-required</a> attribute from the {@code element}.
   */
  void removeAriaRequiredProperty(HTMLElement element);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-multiselectable">
   * aria-multiselectable</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaMultiselectableProperty(HTMLElement element,
      boolean value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-required">
   * aria-required</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaRequiredProperty(HTMLElement element,
      boolean value);
}