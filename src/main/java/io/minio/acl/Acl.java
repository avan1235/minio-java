/*
 * Minio Java Library for Amazon S3 Compatible Cloud Storage, (C) 2015 Minio, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.minio.acl;

public enum Acl {
  /** Canned acl: public-read-write
   * <p>
   * Read: public
   * Write: public
   * </p>
   */
  PUBLIC_READ_WRITE {
    public String toString() {
      return "public-read-write";
    }
  },
  /** Canned acl: private
   * <p>
   * Read: authorized users only
   * Write: authorized users only
   * </p>
   */
  @SuppressWarnings("unused")
  PRIVATE {
    public String toString() {
      return "private";
    }
  },
  /** Canned acl: public-read
   * <p>
   * Read: public
   * Write: authorized users only
   * </p>
   */
  @SuppressWarnings("unused")
  PUBLIC_READ {
    public String toString() {
      return "public-read";
    }
  },
  /** Canned acl: authenticated-read
   * <p>
   * Read: Only users with a valid account, all valid users authorized
   * Write: acl authorized users only
   * </p>
   */
  @SuppressWarnings("unused")
  AUTHENTICATED_READ {
    public String toString() {
      return "authenticated-read";
    }
  },
}
