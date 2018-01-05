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

import elemental2.dom.DomGlobal;
import elemental2.dom.HTMLDivElement;
import org.gwtproject.aria.client.AriaValueAttribute;
import org.gwtproject.aria.client.Attribute;
import org.gwtproject.aria.client.Id;
import org.gwtproject.aria.client.OrientationValue;
import org.gwtproject.aria.client.PrimitiveValueAttribute;
import org.gwtproject.aria.client.RelevantValue;
import elemental2.dom.Document;
import elemental2.dom.HTMLElement;
import com.google.gwt.junit.client.GWTTestCase;

import static elemental2.dom.DomGlobal.*;

/**
 * Tests {@link org.gwtproject.aria.client.Attribute} ARIA class
 */
public class AttributeTest extends GWTTestCase {
  private HTMLDivElement div;
  private org.gwtproject.aria.client.Attribute<org.gwtproject.aria.client.OrientationValue> attribute1;
  private org.gwtproject.aria.client.Attribute<Boolean> attribute2;
  private org.gwtproject.aria.client.Attribute<String> attribute3;
  private org.gwtproject.aria.client.Attribute<org.gwtproject.aria.client.RelevantValue> attribute4;
  private Attribute<org.gwtproject.aria.client.Id> attribute5;

  @Override
  public String getModuleName() {
    return "org.gwtproject.aria.client.AriaTest";
  }

  public void testSetGetRemove_booleanValue() {
    attribute2.setDefault(div);
    attribute2.set(div, false);
    attribute2.set(div, true);
    assertEquals("true", attribute2.get(div));
    attribute2.set(div, false);
    assertEquals("false", attribute2.get(div));
    attribute2.remove(div);
    assertEquals("", attribute2.get(div));
  }

  public void testSetGetRemove_tokenValue() {
    attribute1.setDefault(div);
    assertEquals(org.gwtproject.aria.client.OrientationValue.VERTICAL.getAriaValue(), attribute1.get(div));
    attribute1.remove(div);
    assertEquals("", attribute1.get(div));
    attribute1.set(div, org.gwtproject.aria.client.OrientationValue.HORIZONTAL);
    assertEquals(org.gwtproject.aria.client.OrientationValue.HORIZONTAL.getAriaValue(), attribute1.get(div));
  }

  public void testSetGetRemove_tokenListValue() {
    attribute4.setDefault(div);
    assertEquals(org.gwtproject.aria.client.RelevantValue.ADDITIONS.getAriaValue() + " " + org.gwtproject.aria.client.RelevantValue.TEXT.getAriaValue(),
        attribute4.get(div));
    attribute4.remove(div);
    assertEquals("", attribute1.get(div));
    attribute4.set(div, org.gwtproject.aria.client.RelevantValue.REMOVALS);
    assertEquals(org.gwtproject.aria.client.RelevantValue.REMOVALS.getAriaValue(), attribute4.get(div));
  }

  public void testSetGetRemove_idrefValue() {
    attribute5.set(div, org.gwtproject.aria.client.Id.of("1"), org.gwtproject.aria.client.Id.of("2"));
    assertEquals("1 2", attribute5.get(div));
    attribute5.remove(div);
    assertEquals("", attribute5.get(div));

    HTMLDivElement ref1 = createDiv();
    ref1.id="ref1";
    HTMLDivElement ref2 = createDiv();
    ref2.id="ref2";
    attribute5.set(div, org.gwtproject.aria.client.Id.of(ref1), org.gwtproject.aria.client.Id.of(ref2));
    assertEquals("ref1 ref2", attribute5.get(div));
  }

  private HTMLDivElement createDiv() {
    return (HTMLDivElement) document.createElement("div");
  }

  public void testSetDefaultValue_noSet() {
    try {
      attribute3.setDefault(div);
      throw new Error();
    } catch (AssertionError e) {
      // Expected -- no default value for attribute2
    }
  }

  @Override
  protected void gwtSetUp() throws Exception {
    super.gwtSetUp();
    div = createDiv();
    div.setAttribute("id", "test1");
    document.body.appendChild(div);
    attribute1 = new org.gwtproject.aria.client.AriaValueAttribute<OrientationValue>("attr1", "vertical");
    attribute2 = new org.gwtproject.aria.client.PrimitiveValueAttribute<Boolean>("attr2", "true");
    attribute3 = new org.gwtproject.aria.client.PrimitiveValueAttribute<String>("attr3");
    attribute4 = new org.gwtproject.aria.client.AriaValueAttribute<RelevantValue>("attr4", "additions text");
    attribute5 = new org.gwtproject.aria.client.AriaValueAttribute<Id>("attr5", "");
  }

  @Override
  protected void gwtTearDown() throws Exception {
    super.gwtTearDown();
    div.parentNode.removeChild(div);
  }
}
