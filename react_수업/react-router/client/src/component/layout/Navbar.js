// Router에서는 a 태그 = Link를 import
import { Link, NavLink } from "react-router-dom";

function Navbar() {
  return (
    // <nav className="navbar">
    //   <Link to="/">Home</Link>
    //   <Link to="about">About</Link>
    //   <Link to="contact">Contact</Link>
    // </nav>
    <>
      <header>
        <Link to="admin">Admin</Link>
      </header>
      <nav className="navbar">
        <NavLink to="/">Home</NavLink>
        <NavLink to="about">About</NavLink>
        <NavLink to="contact">Contact</NavLink>
        <NavLink to="orders">Orders</NavLink>
        <NavLink to="products">Products</NavLink>
      </nav>
    </>
  );
}

export default Navbar;
