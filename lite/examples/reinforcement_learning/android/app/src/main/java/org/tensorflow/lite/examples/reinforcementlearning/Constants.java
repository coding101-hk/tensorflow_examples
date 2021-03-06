/*
 * Copyright 2020 The TensorFlow Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.tensorflow.lite.examples.reinforcementlearning;

/** The class that holds all the constants. */
public final class Constants {
  // We always use square board, so only one size is needed
  public static final int BOARD_SIZE = 8;
  public static final int PLANE_CELL_COUNT = 8;
  public static final String TFLITE_MODEL = "planestrike.tflite";
  public static final String TAG = "TfLiteRLDemo";

  private Constants() {}
}
