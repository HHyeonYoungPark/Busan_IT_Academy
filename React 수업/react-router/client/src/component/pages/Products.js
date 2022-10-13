import { Link, Outlet } from "react-router-dom";

function Products() {
  return (
    <>
      <div>
        <input type="search" placeholder="Search Product" />
        <button>search</button>
      </div>
      <div className="nested-navbar">
        <Link to="/products">Featured Lists</Link>
        <Link to="news">New Lists</Link>
      </div>
      <section>
        <Outlet />
      </section>
    </>
  );
}

export default Products;
