
package com.commercetools.api.models.customer;

import java.util.Arrays;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import io.vrap.rmf.base.client.JsonEnum;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AuthenticationMode
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface AuthenticationMode extends JsonEnum {

    /**
    	<p>This is the default value. If set, the <code>password</code> field is required on <a href="ctp:api:type:CustomerDraft">CustomerDraft</a> and is present on <a href="ctp:api:type:Customer">Customer</a>.</p>

    */
    AuthenticationMode PASSWORD = AuthenticationModeEnum.PASSWORD;
    /**
    	<p>If set, the <code>password</code> field is optional on <a href="ctp:api:type:CustomerDraft">CustomerDraft</a> and is not present on <a href="ctp:api:type:Customer">Customer</a>.</p>

    */
    AuthenticationMode EXTERNAL_AUTH = AuthenticationModeEnum.EXTERNAL_AUTH;

    /**
     * possible values of AuthenticationMode
     */
    enum AuthenticationModeEnum implements AuthenticationMode {
        /**
         * Password
         */
        PASSWORD("Password"),

        /**
         * ExternalAuth
         */
        EXTERNAL_AUTH("ExternalAuth");
        private final String jsonName;

        private AuthenticationModeEnum(final String jsonName) {
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
     * factory method for a enum value of AuthenticationMode
     * if no enum has been found an anonymous instance will be created
     * @param value the enum value to be wrapped
     * @return enum instance
     */
    @JsonCreator
    public static AuthenticationMode findEnum(String value) {
        return findEnumViaJsonName(value).orElse(new AuthenticationMode() {
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
    public static Optional<AuthenticationMode> findEnumViaJsonName(String jsonName) {
        return Arrays.stream(values()).filter(t -> t.getJsonName().equals(jsonName)).findFirst();
    }

    /**
     * possible enum values
     * @return array of possible enum values
     */
    public static AuthenticationMode[] values() {
        return AuthenticationModeEnum.values();
    }

}
