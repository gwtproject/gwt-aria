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
 * A generic ARIA Role. This interface defines generic methods for setting, getting, and removing
 * attributes on DOM Elements so that they can be identified by screen readers. Subtypes define
 * methods for specific roles.
 *
 * <p>The ARIA specification defines a hierarchy of roles, which is mirrored here as
 * a hierarchy of Java interfaces. Some roles are abstract and define methods that are common to
 * their children. Only concrete roles (available via methods in {@link Roles}) should be used to
 * modify HTML elements.</p>
 *
 * <p>For more details, see <a href="http://www.w3.org/TR/wai-aria/roles">The Roles Model</a>
 * in the ARIA specification.</p>
 */
public interface Role {

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-atomic">
   * aria-atomic</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaAtomicProperty(HTMLElement element);

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-busy">
   * aria-busy</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaBusyState(HTMLElement element);

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-controls">
   * aria-controls</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaControlsProperty(HTMLElement element);

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-describedby">
   * aria-describedby</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaDescribedbyProperty(HTMLElement element);

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-disabled">
   * aria-disabled</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaDisabledState(HTMLElement element);

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-dropeffect">
   * aria-dropeffect</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaDropeffectProperty(HTMLElement element);

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-flowto">
   * aria-flowto</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaFlowtoProperty(HTMLElement element);

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-grabbed">
   * aria-grabbed</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaGrabbedState(HTMLElement element);

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-haspopup">
   * aria-haspopup</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaHaspopupProperty(HTMLElement element);

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-hidden">
   * aria-hidden</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaHiddenState(HTMLElement element);

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-invalid">
   * aria-invalid</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaInvalidState(HTMLElement element);

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-labelledby">
   * aria-labelledby</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaLabelledbyProperty(HTMLElement element);

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-label">
   * aria-label</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaLabelProperty(HTMLElement element);

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-live">
   * aria-live</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaLiveProperty(HTMLElement element);

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-owns">
   * aria-owns</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaOwnsProperty(HTMLElement element);

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-relevant">
   * aria-relevant</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getAriaRelevantProperty(HTMLElement element);

  /**
   * Gets the ARIA 'role' attribute name as defined in the
   * <a href="http://www.w3.org/TR/wai-aria">WAI-ARIA</a> standard.
   *
   * @see <a href="http://www.w3.org/TR/wai-aria/roles">Roles documentation</a>
   */
  String getName();

  /**
   * Returns the value of the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#tabIndex">
   * tabIndex</a> attribute for the {@code element} or "" if no such attribute is present.
   */
  String getTabindexExtraAttribute(HTMLElement element);

  /**
   * Removes the 'role' attribute from the {@code element}.
   *
   * @see <a href="http://www.w3.org/TR/wai-aria/roles">Roles documentation</a>
   */
  void remove(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-atomic">
   * aria-atomic</a> attribute from the {@code element}.
   */
  void removeAriaAtomicProperty(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-busy">
   * aria-busy</a> attribute from the {@code element}.
   */
  void removeAriaBusyState(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-controls">
   * aria-controls</a> attribute from the {@code element}.
   */
  void removeAriaControlsProperty(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-describedby">
   * aria-describedby</a> attribute from the {@code element}.
   */
  void removeAriaDescribedbyProperty(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-disabled">
   * aria-disabled</a> attribute from the {@code element}.
   */
  void removeAriaDisabledState(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-dropeffect">
   * aria-dropeffect</a> attribute from the {@code element}.
   */
  void removeAriaDropeffectProperty(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-flowto">
   * aria-flowto</a> attribute from the {@code element}.
   */
  void removeAriaFlowtoProperty(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-grabbed">
   * aria-grabbed</a> attribute from the {@code element}.
   */
  void removeAriaGrabbedState(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-haspopup">
   * aria-haspopup</a> attribute from the {@code element}.
   */
  void removeAriaHaspopupProperty(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-hidden">
   * aria-hidden</a> attribute from the {@code element}.
   */
  void removeAriaHiddenState(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-invalid">
   * aria-invalid</a> attribute from the {@code element}.
   */
  void removeAriaInvalidState(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-labelledby">
   * aria-labelledby</a> attribute from the {@code element}.
   */
  void removeAriaLabelledbyProperty(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-label">
   * aria-label</a> attribute from the {@code element}.
   */
  void removeAriaLabelProperty(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-live">
   * aria-live</a> attribute from the {@code element}.
   */
  void removeAriaLiveProperty(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-owns">
   * aria-owns</a> attribute from the {@code element}.
   */
  void removeAriaOwnsProperty(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-relevant">
   * aria-relevant</a> attribute from the {@code element}.
   */
  void removeAriaRelevantProperty(HTMLElement element);

  /**
   * Removes the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#tabIndex">
   * tabIndex</a> attribute from the {@code element}.
   */
  void removeTabindexExtraAttribute(HTMLElement element);

  /**
   * Sets the 'role' attribute of the given {@code element} to the appropriate value for this role.
   *
   * @see <a href="http://www.w3.org/TR/wai-aria/roles">Roles documentation</a>
   */
  void set(HTMLElement element);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-atomic">
   * aria-atomic</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaAtomicProperty(HTMLElement element,
      boolean value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-busy">
   * aria-busy</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaBusyState(HTMLElement element,
      boolean value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-controls">
   * aria-controls</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaControlsProperty(HTMLElement element,
      Id... value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-describedby">
   * aria-describedby</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaDescribedbyProperty(HTMLElement element,
      Id... value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-disabled">
   * aria-disabled</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaDisabledState(HTMLElement element,
      boolean value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-dropeffect">
   * aria-dropeffect</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaDropeffectProperty(HTMLElement element,
      DropeffectValue... value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-flowto">
   * aria-flowto</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaFlowtoProperty(HTMLElement element,
      Id... value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-grabbed">
   * aria-grabbed</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaGrabbedState(HTMLElement element,
      GrabbedValue value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-haspopup">
   * aria-haspopup</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaHaspopupProperty(HTMLElement element,
      boolean value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-hidden">
   * aria-hidden</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaHiddenState(HTMLElement element,
      boolean value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-invalid">
   * aria-invalid</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaInvalidState(HTMLElement element,
      InvalidValue value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-labelledby">
   * aria-labelledby</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaLabelledbyProperty(HTMLElement element,
      Id... value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-label">
   * aria-label</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaLabelProperty(HTMLElement element,
      String value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-live">
   * aria-live</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaLiveProperty(HTMLElement element,
      LiveValue value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-owns">
   * aria-owns</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaOwnsProperty(HTMLElement element,
      Id... value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#aria-relevant">
   * aria-relevant</a> attribute for the {@code element} to the given {@code value}.
   */
  void setAriaRelevantProperty(HTMLElement element,
      RelevantValue... value);

  /**
   * Sets the
   * <a href="http://www.w3.org/TR/wai-aria/states_and_properties#tabIndex">
   * tabIndex</a> attribute for the {@code element} to the given {@code value}.
   */
  void setTabindexExtraAttribute(HTMLElement element,
      int value);
}
