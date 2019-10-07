package yapily.assignment.gateway;

import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.influxdb.annotation.Column;
import org.influxdb.annotation.Measurement;

import static yapily.assignment.gateway.InfluxDBConfiguration.ASSIGNMENT_DATABASE;

@Measurement(name = "request", database= ASSIGNMENT_DATABASE , retentionPolicy="autogen", timeUnit = TimeUnit.MILLISECONDS)
public class RequestMetric {

    @Column(name = "time")
    private Instant time;
    @Column(name = "method", tag = true)
    private String method;
    @Column(name = "status")
    private Integer status;

    public Instant getTime() {
        return time;
    }

    public void setTime(Instant time) {
        this.time = time;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
