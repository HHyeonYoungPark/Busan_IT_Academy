/*
  1. npm i react-router-dom@6
  2. 처음에 만들어놓을 페이지 개수 + NavBar 1장
  3. App.js import
    - BrowserRouter, Routes, Route 모두 사용
    - <Route path="경로" element="{<파일이름 />}" />
*/

import { BrowserRouter, Routes, Route } from "react-router-dom";
// import {BrowserRouter as Router, Routes, Route} from "react-router-dom"
// 이름이 길면 as 붙여서 별명으로 쓰기 가능
import "./App.css";
import Navbar from "./component/layout/Navbar";
import Home from "./component/pages/Home";
import About from "./component/pages/About";
import Contact from "./component/pages/Contact";
import Orders from "./component/pages/Orders";
import Products from "./component/pages/Products";
import Featured from "./component/pages/Featured";
import News from "./component/pages/News";
import Admin from "./component/pages/Admin";
import Users from "./component/pages/Users";
import UserDetail from "./component/pages/UserDetail";
import NotFound from "./component/pages/NotFound";

function App() {
  return (
    <BrowserRouter>
      {/* 고정되어 있는 Nav 메뉴 */}
      <Navbar />

      {/* 페이지 전환이 일어나는 routes */}
      <main>
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="about" element={<About />} />
          <Route path="contact" element={<Contact />} />
          <Route path="orders" element={<Orders />} />
          <Route path="products" element={<Products />}>
            {/* nested(중첩) 메뉴 */}
            {/* <Route path="featured" element={<Featured />} /> */}
            <Route index element={<Featured />} />
            <Route path="news" element={<News />} />
          </Route>
          <Route path="admin" element={<Admin />}>
            {/* nested(중첩) 메뉴 */}
            <Route index element={<Users />} />
            <Route path="userDetail/:id" element={<UserDetail />} />
          </Route>

          <Route path="*" element={<NotFound />} />
        </Routes>
      </main>
    </BrowserRouter>
  );
}

export default App;
