package com.commercetools.api.models.channel;

import com.commercetools.api.models.channel.ChannelRoleEnum;
import com.commercetools.api.models.channel.ChannelUpdateAction;
import com.commercetools.api.models.channel.ChannelAddRolesActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ChannelAddRolesActionImpl.class)
public interface ChannelAddRolesAction extends ChannelUpdateAction {

    
    @NotNull
    @JsonProperty("roles")
    public List<ChannelRoleEnum> getRoles();

    public void setRoles(final List<ChannelRoleEnum> roles);

    public static ChannelAddRolesActionImpl of(){
        return new ChannelAddRolesActionImpl();
    }
    

    public static ChannelAddRolesActionImpl of(final ChannelAddRolesAction template) {
        ChannelAddRolesActionImpl instance = new ChannelAddRolesActionImpl();
        instance.setRoles(template.getRoles());
        return instance;
    }

}
