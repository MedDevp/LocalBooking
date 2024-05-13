const { createProxyMiddleware } = require('http-proxy-middleware');

module.exports = function (app) {
  app.use(
    '/api',
    createProxyMiddleware({
      target: 'http://localhost:8080', // Réglez ceci pour correspondre à l'URL de votre backend Spring Boot
      changeOrigin: true,
      pathRewrite: {
        '^/api': '', // Supprimez le préfixe '/api' des requêtes
      },
    })
  );
};
