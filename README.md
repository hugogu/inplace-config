# In-place Config

## Benchmark

```shell script
docker-compose build
docker run --network host -i loadimpact/k6 run --out influxdb=http://localhost:8086/k6  - < ./k6-scripts/min-latency.js
```

And import:
   * [K6 Dashboard](https://grafana.com/dashboards/2587)

