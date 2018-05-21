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
 * A type that represents the <a href="http://www.w3.org/TR/wai-aria/roles#textbox">textbox</a> role
 * in the ARIA specification.
 *
 * @see Role
 * @see Roles
 */
public interface TextboxRole
    extends InputRole {

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-activedescendant">
   * aria-activedescendant</a> attribute for the {@code element} or "" if no such attribute is
   * present.
   */
  String getAriaActivedescendantProperty(HTMLElement element);

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-autocomplete">
   * aria-autocomplete</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaAutocompleteProperty(HTMLElement element);

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-multiline">
   * aria-multiline</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaMultilineProperty(HTMLElement element);

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-readonly">
   * aria-readonly</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaReadonlyProperty(HTMLElement element);

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-required">
   * aria-required</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaRequiredProperty(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-activedescendant">
   * aria-activedescendant</a> attribute from the {@code element}.
   */
  void removeAriaActivedescendantProperty(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-autocomplete">
   * aria-autocomplete</a> attribute from the {@code element}.
   */
  void removeAriaAutocompleteProperty(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-multiline">
   * aria-multiline</a> attribute from the {@code element}.
   */
  void removeAriaMultilineProperty(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-readonly">
   * aria-readonly</a> attribute from the {@code element}.
   */
  void removeAriaReadonlyProperty(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-required">
   * aria-required</a> attribute from the {@code element}.
   */
  void removeAriaRequiredProperty(HTMLElement element);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-activedescendant">
   * aria-activedescendant</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaActivedescendantProperty(HTMLElement element,
      Id value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-autocomplete">
   * aria-autocomplete</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaAutocompleteProperty(HTMLElement element,
      AutocompleteValue value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-multiline">
   * aria-multiline</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaMultilineProperty(HTMLElement element,
      boolean value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-readonly">
   * aria-readonly</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaReadonlyProperty(HTMLElement element,
      boolean value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-required">
   * aria-required</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaRequiredProperty(HTMLElement element,
      boolean value);
}
