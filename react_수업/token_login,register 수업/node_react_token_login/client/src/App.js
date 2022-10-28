import React, { useState } from "react";
import { BrowserRouter as Router } from "react-router-dom";
import Navbar from "./components/pages/navbar/Navbar";
import "./App.css";
import Routing from "./components/routing/Routing";

const App = () => {
  const [user, setUser] = useState(localStorage.getItem("token"));
  console.log(user);
  return (
    <div>
      <Router>
        <Navbar user={user} />

        <main>
          <Routing user={user} />
        </main>
      </Router>
    </div>
  );
};

export default App;
