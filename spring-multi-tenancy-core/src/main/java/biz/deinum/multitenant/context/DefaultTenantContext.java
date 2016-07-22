/*
 * Copyright 2007-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package biz.deinum.multitenant.context;

/**
 * Simple implementation which only holds a {@code String} representation of a
 * tenant identifier.
 *
 * @author Marten Deinum
 * @since 1.3
 */
class DefaultTenantContext implements TenantContext {

	private String tenant;

	@Override
	public String getTenant() {
		return this.tenant;
	}

	@Override
	public void setTenant(String tenant) {
		this.tenant= tenant;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		DefaultTenantContext that = (DefaultTenantContext) o;
		return this.tenant != null ? this.tenant.equals(that.tenant) : that.tenant == null;

	}

	@Override
	public int hashCode() {
		return this.tenant != null ? this.tenant.hashCode() : 0;
	}

	@Override
	public String toString() {
        return String.format(
                "DefaultTenantContext [tenant=%s]",
                this.tenant);
	}
}
