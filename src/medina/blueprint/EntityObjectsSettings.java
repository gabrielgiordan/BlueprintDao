/*
 * Copyright (C) 2013 Gabriel Giordano
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
package medina.blueprint;

public class EntityObjectsSettings extends EntityRestrictions {

  boolean fillObjects;
  boolean fillSubObjects;

  public void setFillObjects(final boolean fillObjects) {
    this.fillObjects = fillObjects;
  }

  public void setFillSubObjects(final boolean fillSubObjects) {
    this.fillSubObjects = fillSubObjects;
  }

  public boolean isFillObjects() {
    return fillObjects;
  }

  public boolean isFillSubObjects() {
    return fillSubObjects;
  }

}
