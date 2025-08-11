A Spring boot template with react and Vite

Allows vite integration directly with the spring application.

As long as the "environment.type" to "development" inside your application property and "vite.url" contains the localhost url
of your Vite development server, your spring app will serve your Vite app from any url that doesn't match "/api" (it supports
HMR).
You still need to start your vite server manually.
The properties names and their wanted value can be customized and is only used in one place the ClientController class.

For deployment you just need to change the "environment.type" to anything else than "development" (or the wanted value 
if you changed it)
You need to run the vite build manually, but the ouput directory is already configured to be the spring static dir.
