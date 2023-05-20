# ResturantManagementServiceApp

## Frameworks and Language used:
* Spring
* Spring boot
* My-Sql
* Java
## Data Flow
## Controller
###Food

* addFood
* deletedFood
* getAllFood
### Order

* placeOrder
* getOrders
* updateOrder
### Role

* addRole
### User

* signUp
* signIn
* Service
### Food

* addFood
* deletedFood
* getAllFood
### Orde

* placeOrder
* getOrders
* updateOrder
### Role

* addRole
### User

* signUp
* signIn
## Repository
### Food

IFoodRepository

### Order

IOrderRepository

### Role

IRoleRepository

### Token

ITokenRepository

### User

IUserRepository

## Model
### Food

* foodId
* foodName
* foodDescription
* foodPrice
* foodImage
### Order

* orderId
* quantity
* status
* User
* food
### Role

* roleId
* roleType
* roleDescription
### User

userId
userName
password
email
role
### AuthenticationToken

* tokenId
* token
* tokenCreationDate
* user
## dto
### SignInInput

* email
* password
### SignInOutput

* status
* token
### SignUpInput

* userId
* userName
* password
* email
* role
### SignUpOutput

* status
* message

## DataStructure
* List<>/Inumrable<>


## Project Summary

* This API is a Spring Boot project that is about managing jobs. We can create, read, update, and delete jobs. In this project request is sent from the client on HTTP in JSON format or from path variable with server side validations and stored in object then response is sent back from the server by JSON format to the client.
