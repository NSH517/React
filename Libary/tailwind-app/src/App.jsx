import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {

  return (
    <>
      <div className="min-h-screen bg-gray-100 flex items-center justify-center">
      <div className="bg-white dark:bg-black rounded-2xl shadow-lg p-10 text-center">
        <h1 className='text-lime-500 mb-2'>Hello Tailwind!</h1>
        <button className='bg-rose-400/50 p-2 text-white rounded-md hover:bg-rose-400'>button</button>
      </div>
        <img
        class="h-full w-full object-cover md:h-full md:w-48"
        src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTRE04cfXol5MvntsoqyYjV8MAdKG7BA_Mn6g&s"
        alt="Modern building architecture"
      />
    </div>
    </>
  )
}

export default App
