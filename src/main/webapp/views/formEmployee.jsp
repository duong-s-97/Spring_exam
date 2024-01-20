<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <title>Create new employee</title>
</head>
<body>
<div class="container">
<h1>Create new employee</h1>
<form action="/employee/submit" method="post" modelAttribute="employee">
    <input type="hidden" name="id" value="${employee.id}"/>
    <div class="form-outline mb-4">
        <label class="form-label" for="name">Employee Name</label>

        <input required type="text" id="name" class="form-control" name="name" value="${employee.name}" placeholder="Name"/>
    </div>
    <div class="form-outline mb-4">
        <label class="form-label" for="age">Employee Age</label>

        <input required type="number" id="age" class="form-control" name="age" value="${employee.age}" placeholder="Age"/>
    </div>
    <div class="form-outline mb-4">
        <label class="form-label" for="age">Employee Salary</label>

        <input required type="number" id="salary" class="form-control" name="salary" value="${employee.salary}" placeholder="Salary"/>
    </div>
    <button type="submit" class="btn btn-primary">Add</button>
    <button type="reset" class="btn btn-warning">Reset form</button>
</form>

</div>
</body>
</html>