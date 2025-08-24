<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Nutritionist</title>

    <style>
        /* Styling */
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Arial', sans-serif;
            background-color: #f4f4f4;
            color: #333;
            padding: 0;
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            flex-direction: column;
            background-image: url('images/nutritionistbg.jpg');
            background-size: cover;
            background-position: center;
        }

        .signup-form {
            background-color: rgba(255, 255, 255, 0.85);
            padding: 40px;
            border-radius: 15px;
            box-shadow: 0 4px 10px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 600px;
        }

        h2 {
            font-size: 2em;
            color: #333;
            text-align: center;
            margin-bottom: 20px;
        }

        p {
            font-size: 1.1em;
            color: #666;
            text-align: center;
            margin-bottom: 20px;
        }

        .input-container {
            margin-bottom: 20px;
        }

        label {
            font-size: 1.1em;
            color: #444;
            display: block;
            margin-bottom: 5px;
        }

        input[type="text"], input[type="email"], input[type="password"], input[type="number"], input[type="date"], select {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            font-size: 1.1em;
            border: 1px solid #ddd;
            border-radius: 5px;
        }

        .button-container {
            text-align: center;
            margin-top: 20px;
        }

        .submit-btn, .back-btn {
            background-color: #74c69d;
            color: white;
            font-size: 1.1em;
            border: none;
            border-radius: 5px;
            padding: 12px 20px;
            cursor: pointer;
            margin-top: 20px;
            transition: background-color 0.3s;
        }

        .submit-btn:hover, .back-btn:hover {
            background-color: #52b788;
        }

        footer {
            text-align: center;
            margin-top: 50px;
            font-size: 1em;
            color: rgba(108, 117, 125, 0.6);
        }

        footer a {
            color: #007bff;
            text-decoration: none;
        }

        footer a:hover {
            text-decoration: underline;
        }

        .signup-image {
            margin-top: 30px;
            text-align: center;
        }

        .signup-image img {
            width: 100%;
            max-width: 500px;
            border-radius: 10px;
        }
    </style>
</head>
<body>
    <header>
        <h1>Nutritionist Management</h1>
    </header>

    <%@ include file="adminnavbar.jsp" %>

    <!-- Sign-up Form Section -->
    <section class="signup-form">
        <h2>Sign Up (Nutritionist)</h2>
        <p>Join NutriScout to help analyze dietary habits and detect nutrient deficiencies, particularly in children and adolescents.</p>

        <form method="post" action="insertNutritionistadmin">
            <div class="input-container">
                <label for="nname">Enter Name</label>
                <input type="text" id="nname" name="nname" required placeholder="Nutritionist name"/>
            </div>

            <div class="input-container">
                <label for="nemail">Enter Email ID</label>
                <input type="email" id="nemail" name="nemail" required placeholder="Nutritionist email"/>
            </div>

            <div class="input-container">
                <label for="nage">Enter Age</label>
                <input type="date" id="nage" name="nage" required/>
            </div>

            <div class="input-container">
                <label for="ncontact">Enter Contact</label>
                <input type="number" id="ncontact" name="ncontact" required placeholder="Nutritionist Contact No"/>
            </div>

            <div class="input-container">
                <label for="nspecification">Specification</label>
                <select id="nspecification" name="nspecification" required>
                    <option value="">---select---</option>
                    <option value="general">General(Overall)</option>
                    <option value="cardiac">Cardiac</option>
                    <option value="sportsnutritionist">Sports Nutritionist</option>
                    <option value="child">Child</option>
                    <option value="aged">Aged</option>
                </select>
            </div>

            <div class="input-container">
                <label for="nexperience">Enter Experience</label>
                <input type="text" id="nexperience" name="nexperience" required placeholder="Nutritionist Experience"/>
            </div>

            <div class="input-container">
                <label for="neducation">Enter Education</label>
                <input type="text" id="neducation" name="neducation" required placeholder="Nutritionist Education"/>
            </div>

            <div class="input-container">
                <label for="npassword">Enter Password</label>
                <input type="password" id="npassword" name="npassword" required placeholder="Nutritionist Password"/>
            </div>

            <div class="button-container">
                <input type="submit" value="Register" class="submit-btn"/>
                <input type="reset" value="Clear" class="back-btn"/>
            </div>
        </form>

        <a href="/" class="back-btn">Back</a>
    </section>

    <!-- Image Section -->
    <section class="signup-image">
        <img src="images/nutritionist.jpg" alt="Nutritionist Image"/>
    </section>

    <footer>
        <p>© 2024 NutriDiet Project</p>
    </footer>
</body>
</html>
