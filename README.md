# hiberus-checkout
Project to simulate checkout process with a microservice approach using Spring Boot.

This project, joined to the projects in the "hiberus-bill" and "hiberus-logistic" repositories,
make up the software development for the technical exam received from the hiberus team.

## Built with:
The leveraged technologies were:
- Spring Boot: I have my last years using it, and I am satisfied with the technology.
- SpringDoc and Swagger UI: API docs based on the OpenAPI 3 specification.
- Maven: I like it to manage the dependencies.
- Postman: for performing services tests.
- IntelliJ: I have one year using it, and it´s very good.

## Structure
In the projects there is an order among the diverse programming language objects;
each of those are ordered in different packages. And within every project
there are layers structures in which controllers and services are separated.

## Arquitecture
The arquitecture was focused on microservices, whence there are 3 projects, each of those
expose a service and contain the entire logic for each one. The communication among
the projects is made through REST services.

## API Docs
API docs are available in these URLs:
- Checkout: http://localhost:9090/swagger-ui/index.html
- Bill:     http://localhost:9091/swagger-ui/index.html
- Logistic: http://localhost:9092/swagger-ui/index.html

## Flow
The simulated checkout flow is the following:

1. All the projects must be deployed.

2. An Order is sent to the checkout service (using Postman) through its exposed service: http://localhost:9090/checkout
   The Post request is a JSON like this:
```
 {
    "clientId": 1,
    "date": "",
    "direction": "5th avenue",
    "products": [
        {
            "id": 1,
            "quantity": 4,
            "cost": 20.5
        },
        {
            "id": 2,
            "quantity": 10,
            "cost": 8
        }
    ]
}
```

3. Checkout service calls to Bill service and this one returns the sum of all products in the Order.

4. Checkout service calls to Logistic service and this one returns a status "SENT" of a simulated sent Order.

5. Checkout service returns a response to Postman, including the sum and the status.

## Other tests
Bill and Logistic services can be tested directly using Postman (or SpringDoc).

- Bill service: this will return the sum of all products in the Order.
  Use a Post request to http://localhost:9091/bill, with a JSON like this:
```
[
    {
        "id": 1,
        "quantity": 4,
        "cost": 20.5
    },
    {
        "id": 2,
        "quantity": 10,
        "cost": 8
    }
]
```

- Logistic service: remember this service is a simulation of a sent Order. This will return the successful status.
  Use a Post request to http://localhost:9092/logistic, with a JSON like this:
```
 {
    "clientId": 1,
    "date": "",
    "direction": "5th avenue",
    "products": [
        {
            "id": 1,
            "quantity": 4,
            "cost": 20.5
        },
        {
            "id": 2,
            "quantity": 10,
            "cost": 8
        }
    ]
}
```

