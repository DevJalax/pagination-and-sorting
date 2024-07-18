# pagination-and-sorting

The primary purpose of using pagination with Spring Boot and JPA is to retrieve only the relevant data required for the current page, instead of fetching the entire dataset at once.

@PageableDefault annotation -> set the default pagination settings for your application. This annotation is used on a method parameter in your controller class, and it allows you to specify the default page size, sort field, and sort direction.

The Pageable object is then created using the PageRequest.of() method, which takes the page number, page size, and the Sort object as parameters.

page: The current page number (default is 0)

size: The page size (default is 10)

sortBy: The field to sort by (default is "price")

sortDir: The sort direction (default is "asc")
