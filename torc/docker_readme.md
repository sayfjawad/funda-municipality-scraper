
# Setting Up a Tor Docker Container:

### You can build and run this with:
```
docker build -t tor-container .
docker run -p 9050:9050 tor-container
```

### You can build and run this with:
```
docker build -t tor-container .
docker run -p 9050:9050 tor-container
```
Make sure that you're logged in to Docker (with docker login) before attempting to push, and ensure that your Docker Hub username matches the one you're using in the command.
```
docker login
```
Make sure you've tagged your image properly:
```
docker tag tor-container <username>/tor-container:latest
```
Push the tagged image to Docker Hub:
```
docker push <username>/tor-container:latest
```
