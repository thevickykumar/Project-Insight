# Project-Insight 👋

A full-stack project management system to help you and your team manage tasks and projects efficiently. This application is built with a modern technology stack for a robust and scalable solution.

## Screenshots

Here are some screenshots of the application's user interface:

### Authentication Pages

Here is the login and registration pages.

![Login Page]([http://googleusercontent.com/file_content/3](https://drive.google.com/file/d/1d696O4G0Wav0Cm5rM3hRQuijliKsWmpF/view?usp=sharing))
![Registration Page]([http://googleusercontent.com/file_content/2](https://drive.google.com/file/d/1_l2iCu8bMimpCAL_wkLmLDb7ggS-oyS-/view?usp=sharing))

### Dashboard and Project Creation

Here you can see the dashboard with filters and the modal for creating a new project.

### Upgrades and Payments

Here is the pricing page and the payment gateway integration.

## Key Features

* **User Authentication**: Secure user registration and login using JWT.

* **Project Management**: Create, view, and manage projects and tasks.

* **Team Collaboration**: Invite and manage team members on your projects.

* **Task Tracking**: Organize and track tasks with different statuses and tags.

* **Secure Payments**: Integrated with Razorpay for secure online payments.

* **Responsive UI**: A modern and responsive user interface for a great experience on any device.

## Technologies Used

* **Frontend**: `React`, `Redux`, `Tailwind CSS`

* **Backend**: `Spring Boot`

* **Database**: `MySQL`

* **Security**: `JWT` (JSON Web Token)

* **Payments**: `Razorpay`

## Getting Started

Follow these simple steps to get the project up and running on your local machine.

### Prerequisites

Make sure you have the following installed:

* `Java JDK 21` or higher

* `Node.js`

* `MySQL Server`

* `Git`

### 1. Clone the Repository

Open your terminal and clone the project from GitHub.

```
git clone [https://github.com/thevickykumar/Project-Insight.git](https://github.com/thevickykumar/Project-Insight.git)

```

### 2. Backend Setup (Spring Boot)

1.  Navigate to the backend directory.

    ```
    cd Project-Insight
    
    ```

2.  Create a `.env` file in the main project directory and add your configuration details.

    ```
    DB_URL=jdbc:mysql://localhost:3306/your_database_name
    DB_USERNAME=your_username
    DB_PASSWORD=your_password
    MAIL_USERNAME=your_email@gmail.com
    MAIL_PASSWORD=your_app_password
    RAZORPAY_KEY=your_razorpay_key
    RAZORPAY_SECRET=your_razorpay_secret
    
    ```

    *Note: Make sure your `application.properties` is configured to read from these environment variables.*

3.  Run the Spring Boot application.

    ```
    ./mvnw spring-boot:run
    
    ```

### 3. Frontend Setup (React)

1.  Navigate to the frontend directory.

    ```
    cd frontend
    
    ```

2.  Install the necessary dependencies.

    ```
    npm install
    
    ```

3.  Start the React development server.

    ```
    npm start
    
    ```

### 4. Open the Application

Once both the backend and frontend are running, open your web browser and go to `http://localhost:5173` to see the application in action. 


