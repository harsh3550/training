<html>
<body>
    <br>
    <h2>Jersey RESTful Web Application!</h2>
    <p>
        <a href="rest/empCRUD/">Click Here</a>
    </p>
    <hr>
    <h2>Form to add Emp by Get: Create in CRUD: </h2>
    <form action="rest/empCRUD/add" method="get">
      Enter Emp id: <input type="number" name="eid">
      Enter Emp Name: <input type="text" name="ename">
      <input type="Submit">
    </form>
    <br>
    <hr>
    <h2>Form to add Emp by Post: Create in CRUD: </h2>
    <form action="rest/empCRUD/addPost" method="post">
      Enter Emp id: <input type="number" name="eid">
      Enter Emp Name: <input type="text" name="ename">
      <input type="Submit">
    </form>
    <br>
    <hr>
    <h2>Get List of Emps : Read in CRUD: </h2>
    <a href="rest/empCRUD/getAll"> Get the list of Emps</a>

    <br>
    <hr>
    <h2>Form to Update Emp by Get: Update in CRUD: </h2>
    <form action="rest/empCRUD/updateEmp" method="get">
      Enter Emp id: <input type="number" name="eid">
      Enter Emp Name: <input type="text" name="ename">
      <input type="Submit">
    </form>

    <br>
    <hr>
    <h2>Form to Delete Emp by Get: Delete in CRUD: </h2>
    <form action="rest/empCRUD/delEmp" method="get">
      Enter Emp id: <input type="number" name="eid">
      <input type="Submit">
    </form>

    <br>
    <hr>
    <h2>Form to Get an Emp by Get: Read in CRUD: </h2>
    <form action="rest/empCRUD/getEmp" method="get">
      Enter Emp id: <input type="number" name="eid">
      <input type="Submit">
    </form>

    <h1>End of REST</h1>

  </body>
</html>

