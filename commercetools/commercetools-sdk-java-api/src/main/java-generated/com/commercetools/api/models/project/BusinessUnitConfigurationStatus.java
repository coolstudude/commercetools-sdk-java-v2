
package com.commercetools.api.models.project;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Default value for Business Unit Status configured though Project settings.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface BusinessUnitConfigurationStatus extends JsonEnum {

    /**
    	<p>The <a href="ctp:api:type:BusinessUnit">Business Unit</a> can be used in <a href="ctp:api:type:Order">Orders</a>, <a href="ctp:api:type:Cart">Carts</a>, and <a href="/../api/quotes-overview">Quotes</a> and can be updated using the <a href="ctp:api:endpoint:/{projectKey}/me/business-units:POST">My Business Unit endpoint</a>.</p>

    */
    BusinessUnitConfigurationStatus ACTIVE = BusinessUnitConfigurationStatusEnum.ACTIVE;
    /**
    	<p>The <a href="ctp:api:type:BusinessUnit">Business Unit</a> cannot be used in <a href="ctp:api:type:Order">Orders</a>, <a href="ctp:api:type:Cart">Carts</a>, and <a href="/../api/quotes-overview">Quotes</a> and cannot be updated using the <a href="ctp:api:endpoint:/{projectKey}/me/business-units:POST">My Business Unit endpoint</a>.</p>

    */
    BusinessUnitConfigurationStatus INACTIVE = BusinessUnitConfigurationStatusEnum.INACTIVE;

    /**
     * possible values of BusinessUnitConfigurationStatus
     */
    enum BusinessUnitConfigurationStatusEnum implements BusinessUnitConfigurationStatus {
        /**
         * Active
         */
        ACTIVE("Active"),

        /**
         * Inactive
         */
        INACTIVE("Inactive");
        private final String jsonName;

        private BusinessUnitConfigurationStatusEnum(final String jsonName) {
            this.jsonName = jsonName;
        }

        public String getJsonName() {
            return jsonName;
        }

        public String toString() {
            return jsonName;
        }
    }

    /**
     * the JSON value
     * @return json value
     */
    @JsonValue
    String getJsonName();

    /**
     * the enum value
     * @return name
     */
    String name();

    /**
     * convert value to string
     * @return string representation
     */
    String toString();

    /**
     * factory method for a enum value of BusinessUnitConfigurationStatus
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static BusinessUnitConfigurationStatus findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new BusinessUnitConfigurationStatus() {
            @Override
            public String getJsonName() {
                return value;
            }

            @Override
            public String name() {
                return value.toUpperCase();
            }

            public String toString() {
                return value;
            }
        });
    }

    /**
     * method to find enum using the JSON value
     * @param jsonName the json value to be wrapped
     * @return optional of enum instance
     */
    public static Optional<BusinessUnitConfigurationStatus> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static BusinessUnitConfigurationStatus[] values() {
        return BusinessUnitConfigurationStatusEnum.values();
    }

}
