import React from "react";
import { Link } from "react-router-dom";

const Navbar = ({ user }) => {
  return (
    <nav>
      <Link to="/">Home</Link>
      <Link to="/profile">Profile</Link>
      {!user && (
        <>
          <Link to="/login">Login</Link>
          <Link to="/register">Register</Link>
        </>
      )}
      {user && (
        <>
          <Link to="/logout">Logout</Link>
        </>
      )}
    </nav>
  );
};

export default Navbar;
