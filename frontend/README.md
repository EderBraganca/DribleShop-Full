# React + TypeScript + Vite

This template provides a minimal setup to get React working in Vite with HMR and some ESLint rules.

Currently, two official plugins are available:

- [@vitejs/plugin-react](https://github.com/vitejs/vite-plugin-react/blob/main/packages/plugin-react/README.md) uses [Babel](https://babeljs.io/) for Fast Refresh
- [@vitejs/plugin-react-swc](https://github.com/vitejs/vite-plugin-react-swc) uses [SWC](https://swc.rs/) for Fast Refresh

## Expanding the ESLint configuration

If you are developing a production application, we recommend updating the configuration to enable type aware lint rules:

- Configure the top-level `parserOptions` property like this:

```js
export default {
  // other rules...
  parserOptions: {
    ecmaVersion: 'latest',
    sourceType: 'module',
    project: ['./tsconfig.json', './tsconfig.node.json'],
    tsconfigRootDir: __dirname,
  },
}
```

Directory explain (in PT-BR):

- assets: Armazena recursos estáticos como imagens, fontes, etc.
- components: Contém componentes React organizados por funcionalidades (common, Product, Cart, User, Order).
- pages: Contém os componentes de página principais, cada um representando uma rota do aplicativo.
- services: Abstrações para chamadas de API e outras utilidades.
- store: Configuração do Redux, incluindo actions, reducers e middlewares.
- styles: Arquivos de estilo CSS.
- public: Arquivos públicos como index.html.
