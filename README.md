This is a project mainly to an example of Dagger 2, a very popular dependency injection tool owned by Google. 
In this example we are building a car, using tire, chassi, engine... If we do all that in the main activity, then our app will take long
to launch and user experience will be poor. So it becomes the need for dependency injection, meaning all the building of the components 
of the car should be assigned to others classes other than the activity and inject them to the activity. This way the activity will be
lean and is only responsible for displaying views and interacting with user intiated UI events like touch and click... It will be easy 
to test the activity since it is loosely coupled with the car factory classes. 
There are few modules that has nothing to do with dagger implementation but sample modules to show modularity of android apps. I plan to 
coordinate them with the app module in the future when I have time.  
