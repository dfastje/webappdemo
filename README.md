# webappdemo
Monte Carlo simulations are best described as "throwing darts randomly at a board and 
gathering information from where they land." These simulations are used extensively in
nuclear science given their similarity to the randomness exhibited by nuclear decay.  
  
This Monte Carlo simulation uses random 2-dimensional datapoints to predict the ratio of 
the area of a circle of a given radius to the area of a square of side length = 2*radus. 
The theoretical value of this ratio will always be equal to pi/4.  
  
This project has no client side code and is meant to be run by consuming its rest 
endpoints in either a tool like Postman or simply from a web browser.  
  
**Run Instructions:**  
* Ensure that nothing is using port 8090 on your machine
  * I always have Jenkins already running on port 8080. If port 8090 is permanently 
  in use on your computer, you will need to change the "server.port" line in the 
  "application.properties" file.
  * "http://localhost:8090" will be left off of the URLs for now on.
* Start the application as shown in the image in "ImportAndBuildingImgs" directory
* Run the application: **"interview/montecarlo/{radius}/{numPoints}"**
  * {radius} is a positive, non-zero double.
  * {numPoints} is a positive, non-zero int.
* **Output:** The ratio of the area in a circle to a square is **{ratio}** for radius 
**{radius}** using **{numPoints}** datapoints
  * The theoretical ratio is pi/4 = 0.7854 and increasing the number of points will
  increase the precision of the experiment. 
  * Units are left off of the radius to emphasize that the radius doesn't matter.
* **Dockerize:** to create a docker container with the webapp, run the following commands 
    from the command prompt in the project home directory.
    ```$xslt
    docker build -f Dockerfile -t docker-example-webapp .
    docker images
    docker run -p 8090:8090 docker-example-webapp
    ```  