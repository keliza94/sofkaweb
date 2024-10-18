@Compras
Feature: Flujo de compra en OpenCart

  @Carritodecompras
  Scenario Outline: Comprar productos
    Given que el "Cliente" esta en la home de Opencart
    When agrego los siguientes productos al carrito:
      | <producto1>          |
      | <producto2>          |

    When completo el formulario de compra con los siguientes datos:
      | Firstname     | <first_name>       |
      | Lastname      | <last_name>        |
      | Email         | <email>            |
      | Telephone     | <telephone>        |
      | Address1      | <address1>         |
      | City          | <city>             |
      | Postcode      | <post_code>        |
      | Country       | <country>          |
      | Region        | <region_state>     |
      | Comment       | <comment>          |
      | Firstnameshipping     | <first_name_shipping>       |
      | Lastnameshipping      | <last_name_shipping>        |
      | Address1shipping      | <address1_shipping>         |
      | Cityshipping          | <city_shipping>             |
      | Postcodeshipping      | <post_code_shipping>        |
      | Countryshipping       | <country_shipping>          |
      | Regionshipping       | <region_state_shipping>     |



    Examples:
      | producto1         | producto2          | first_name           | last_name     | email                   | telephone   | address1 | city  |post_code|country  |region_state| comment|  first_name_shipping |last_name_shipping | address1_shipping| city_shipping| post_code_shipping| country_shipping| region_state_shipping|
      | MacBook           | iPhone             | Katherin             | Medina        | kathy.esnimer@gmail.com | 0985245874  | prueba   | Quito |5285     | Ecuador | Pichincha  | tester |     elizabeth        |           Vargas  |  3433422         |      cuenca  |      545645              | Argentina       | Chaco                |
