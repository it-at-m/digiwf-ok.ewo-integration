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

An example configuration can be found within the properties files.

* `application.yml`: `digiwf-okewo-integration-service/src/main/resources/application.yml`
* `application-local.yml`: `digiwf-okewo-integration-service/src/main/resources/application.yml`

The file `application.yml` contains the configuration according graceful shutdown, metrics, ports, ...

The file `application-local.yml` provides the event bus and OK.EWO relevant configuration.
The event bus configuration is implemented
according [DigiWF Spring Cloudstream Utils](https://github.com/it-at-m/digiwf-spring-cloudstream-utils#getting-started).

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
A crucial and mandatory JSON object attribute is `eventType`.
This attribute is necessary for correct deserialization of the requests JSON payload.

The date and time information within the request and response payload are provided in ISO standard.

##### getPerson

Gets a Person on the basis of an Ordnungsmerkmal.

```yaml
{
  "eventType": "getPerson",
  "ordnungsmerkmal": "99"
}
```

##### searchPerson

Searches Persons based on search parameters.

```yaml
{
  "eventType": "searchPerson",
  "searchPerson": {
    "benutzer": {
      "benutzerId": "enim nostrud"
    },
    "suchkriterien": {
      "datensatzstatus": "AKTUELL",
      "familienname": "veniam elit cupidatat nostrud",
      "geburtsdatum": {
        "datum": "proident Ut quis"
      },
      "geschlecht": "esse enim",
      "vorname": "aute eu laboris",
      "buchstabeVon": "tempor",
      "buchstabeBis": "non ipsum nostrud",
      "hausnummerVon": "in laboris dolore et ipsum",
      "hausnummerBis": "in sed commodo consectetur",
      "strassenschluessel": "nulla minim esse pariatur",
      "teilnummerVon": "incididunt anim",
      "teilnummerBis": "labore incididunt laboris id",
      "wohnort": "et incididunt",
      "postleitzahl": "Ut mollit nisi"
    }
  }
}
```

##### getPersonErweitert

Gets a PersonErweitert on the basis of an Ordnungsmerkmal.

The following JSON object shows the example payload set at the element templates request field.

```yaml
{
  "eventType": "getPersonErweitert",
  "ordnungsmerkmal": "99"
}
```

##### searchPersonErweitert

Searches PersonErweitert based on search parameters.

```yaml
{
  "eventType": "searchPersonErweitert",
  "searchPersonErweitert": {
    "benutzer": {
      "benutzerId": "esse sit laboris aliquip"
    },
    "suchkriterien": {
      "datensatzstatus": "INAKTUELL",
      "familienname": "dolore ",
      "geburtsdatum": {
        "datum": "dolor ull"
      },
      "geschlecht": "ullamco amet voluptate",
      "vorname": "proident",
      "buchstabeVon": "non cupidatat",
      "buchstabeBis": "in",
      "hausnummerVon": "sint anim eiusmod",
      "hausnummerBis": "Ut dolore fugiat",
      "strassenschluessel": "officia Duis ut ut",
      "teilnummerVon": "amet",
      "teilnummerBis": "enim esse in aute",
      "wohnort": "dolore fugiat",
      "postleitzahl": "sed tempor qui nulla",
      "ordnungsmerkmal": "nostrud qui aliqua"
    }
  }
}
```


