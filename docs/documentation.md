## Documentation

Basically, two artifacts are available.
This is on the one hand the Spring-Boot-Starter `digiwf-okewo-integration-starter`
and on the other hand the service `digiwf-okewo-integration-service` which is provided as an
[Image](https://hub.docker.com/repository/docker/itatm/digiwf-okewo-integration-service).

### Spring-Boot-Starter

tbd

### Service provided as an image

The service is provided via Dockerhub as
an [Image](https://hub.docker.com/repository/docker/itatm/digiwf-okewo-integration-service).

The requests to OK.EWO are expected by the service over an event bus messages.

#### Service Configuration

tbd

#### Service API usage

The OK.EWO requests are to be made via the element template defined in `okEwoIntegration.json`.
The service and the template are providing four type of requests.
The request type can be defined via the element template in field `Event Type`.

* `getPerson`
* `searchPerson`
* `getPersonErweitert`
* `searchPersonErweitert`

For each request type the payload has to be defined in the element templates request field as a JSON object.
The response is also an JSON object.

##### getPerson

Gets a Person on the basis of an Ordnungsmerkmal.

##### getPersonErweitert

Gets a PersonErweitert on the basis of an Ordnungsmerkmal.


