import "./App.css";
import axios from "axios";
import { useState, useEffect } from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";

import Navbar from "./component/layout/Navbar";
import Cultural from "./component/pages/Cultural";
import Tour from "./component/pages/Tour";
import Business from "./component/pages/Business";
import Introduction from "./component/pages/Introduction";
import Notice from "./component/pages/Notice";
import OpenInfo from "./component/pages/OpenInfo";
import DetailView from "./component/pages/DetailView";
import Footer from "./component/layout/Footer";
import NotFound from "./component/pages/NotFound";

function App() {
  // 문화재정보 list 화면에 띄우기
  const URL =
    "https://apis.data.go.kr/6480000/gyeongnamcultural/gyeongnamculturallist?serviceKey=q8orw7k2njYhNUEcrsiFBCsSN%2BpEMXu%2FSH81cRpaGv%2Fc2%2Fo49uyLFU6rqCOjvUEeHdQFFGTUK4Ln7gRQlhHBpQ%3D%3D&pageNo=1&numOfRows=15&resultType=json";
  const [cultural, setCultural] = useState([]);

  useEffect(() => {
    const fetchData = async function (err) {
      const result = await axios.get(URL);

      if (err) {
        throw err;
      } else {
        console.log(result);
        setCultural(result.data.gyeongnamculturallist.body.items.item);
      }
    };

    fetchData();
  }, []);

  // 관광정보 list 화면에 띄우기
  const URL2 =
    "https://apis.data.go.kr/6480000/gyeongnamtourculture/gyeongnamtourculturelist?serviceKey=q8orw7k2njYhNUEcrsiFBCsSN%2BpEMXu%2FSH81cRpaGv%2Fc2%2Fo49uyLFU6rqCOjvUEeHdQFFGTUK4Ln7gRQlhHBpQ%3D%3D&pageNo=1&numOfRows=10&resultType=json";
  const [tour, setTour] = useState([]);

  useEffect(() => {
    const fetchData = async function (err) {
      const result = await axios.get(URL2);

      if (err) {
        throw err;
      } else {
        console.log(result);
        setTour(result.data.gyeongnamtourculturelist.body.items.item);
      }
    };

    fetchData();
  }, []);

  return (
    <Router>
      <Navbar />
      <main>
        <Routes>
          <Route path="/" element={<Cultural cultural={cultural} />} />
          <Route path="tour" element={<Tour tour={tour} />} />
          <Route path="business" element={<Business />} />
          <Route path="openinfo" element={<OpenInfo />} />
          <Route path="introduction" element={<Introduction />} />
          <Route path="notice" element={<Notice />} />
          <Route path="*" element={<NotFound />} />
        </Routes>
      </main>
      <Footer />
    </Router>
  );
}

export default App;
