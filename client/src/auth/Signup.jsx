import React, { useState } from "react";

function Signup() {
  const [n, setN] = useState("");
  const [e, setE] = useState("");
  const [p, setP] = useState("");

  async function submitHandeler() {
    const obj = {
      name: n,
      email: e,
      password: p,
    };

    try {
      const response = await fetch("http://localhost:8080/api/signup", {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(obj),
      });

      const data = await response.text();
      console.log("Response:", data);
      alert("Signup successful");
    } catch (error) {
      console.error("Error:", error);
      alert("Signup failed");
    }
  }

  return (
    <div>
      <h3>Create Account</h3>

      <input
        type="text"
        placeholder="name"
        onChange={(e) => setN(e.target.value)}
      />
      <br />

      <input
        type="email"
        placeholder="email"
        onChange={(e) => setE(e.target.value)}
      />
      <br />

      <input
        type="password"
        placeholder="password"
        onChange={(e) => setP(e.target.value)}
      />
      <br /><br />

      <button onClick={submitHandeler}>Submit</button>

      <h4>name : {n}</h4>
      <h4>email : {e}</h4>
      <h4>password : {p}</h4>
    </div>
  );
}

export default Signup;
