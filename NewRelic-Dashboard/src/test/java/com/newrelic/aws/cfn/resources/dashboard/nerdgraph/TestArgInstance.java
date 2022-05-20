package com.newrelic.aws.cfn.resources.dashboard.nerdgraph;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.newrelic.aws.cfn.resources.dashboard.DashboardInput;
import com.newrelic.aws.cfn.resources.dashboard.nerdgraph.schema.DashboardCreateErrorType;
import com.newrelic.aws.cfn.resources.dashboard.nerdgraph.schema.DashboardCreateResult;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.tuple.Pair;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY, getterVisibility = JsonAutoDetect.Visibility.NONE, setterVisibility = JsonAutoDetect.Visibility.NONE)
public class TestArgInstance {
    @JsonProperty("foo_json")
    public String foo;

    protected Integer bar;

    private Float hello;

    @JsonProperty("world_json")
    Double world;

    @JsonProperty("list_json")
    public List<Object> list;

    @JsonProperty("dashboard_input")
    protected DashboardInput dashboardInput;

    @JsonProperty("normal_type")
    Pair<String, Integer> pair;
}
