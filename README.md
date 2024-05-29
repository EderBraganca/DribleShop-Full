#Explicação Dos Diretorios

Backend (Spring Boot)
 - core/domain: Contém as entidades do domínio do negócio (Product, User, Order).
 - core/repository: Define as interfaces dos repositórios (ProductRepository, UserRepository, OrderRepository).
 - core/service: Contém as implementações dos serviços de negócio (ProductService, UserService, OrderService).
 - core/usecase: Implementa casos de uso específicos da aplicação (CreateProductUseCase, GetUserUseCase, PlaceOrderUseCase).
 - adapter/controller: Contém os controladores REST que expõem as APIs (ProductController, UserController, OrderController).
 - adapter/repository: Implementações específicas dos repositórios usando JPA (JpaProductRepository, JpaUserRepository, JpaOrderRepository).
 - config: Configurações da aplicação como segurança, banco de dados, etc. (SecurityConfig, DatabaseConfig).
 - docker: Arquivos relacionados ao Docker (Dockerfile, docker-compose.yml).
 - test: Testes unitários para os serviços e outros componentes (ProductServiceTest, UserServiceTest, OrderServiceTest).


Frontend (React)
 - assets: Armazena recursos estáticos como imagens, fontes, etc.
 - components: Contém componentes React organizados por funcionalidades (common, Product, Cart, User, Order).
 - pages: Contém os componentes de página principais, cada um representando uma rota do aplicativo.
 - services: Abstrações para chamadas de API e outras utilidades.
 - store: Configuração do Redux, incluindo actions, reducers e middlewares.
 - styles: Arquivos de estilo CSS.
 - public: Arquivos públicos como index.html.
 - docker: Arquivos Docker específicos do frontend.